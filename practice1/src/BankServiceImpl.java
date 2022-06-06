import javax.swing.text.html.parser.Entity;
import java.util.ArrayList;
import java.util.List;

public class BankServiceImpl implements BankService
{
    BankRepositoryImpl bankRepository = new BankRepositoryImpl();

    @Override
    public void addToRepository(BankRequestDTO requestDTO)
    {
        ArrayList<BankEntity> BankEntityCheckList = bankRepository.getList();
        for(BankEntity entity: BankEntityCheckList)
        {
            if(entity.getId() == requestDTO.getId())
                try {
                    throw new Exception("Item is existing");
                } catch (Exception e) {
                    e.printStackTrace();
                }
        }

        BankEntity entity = new BankEntity().mapRequestDTOToEntity(requestDTO);
        bankRepository.add(entity);
    }

    @Override
    public ArrayList<BankResponseDTO> getAllBanks()
    {
        ArrayList<BankResponseDTO> BankResponseDTOList = new ArrayList<>();
        ArrayList<BankEntity> BankEntityList = bankRepository.getList();
        for (BankEntity entity:BankEntityList)
        {
               BankResponseDTO response = BankEntity.mapBankEntityToBankResponseDto(entity);
               BankResponseDTOList.add(response);
        }
        return BankResponseDTOList;
    }

    @Override
    public BankResponseDTO getBankByID(int id)
    {
        return bankRepository.getBankByID(id);
    }

    @Override
    public void deleteBankByID(int id)
    {
        bankRepository.deletByID(id);
    }
}
