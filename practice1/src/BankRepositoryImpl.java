import java.util.ArrayList;

public class BankRepositoryImpl implements BankRepository
{
    public BankRepositoryImpl() {}
    private final ArrayList<BankEntity> List = new ArrayList<>();

    @Override
    public void add(BankEntity  bankEntity)
    {
        List.add(bankEntity);
    }

    @Override
    public ArrayList<BankEntity> getList()
    {
        return List;
    }

    @Override
    public void displayList()
    {
        System.out.println(List.get(0));
    }

    @Override
    public BankResponseDTO getBankByID(int id)
    {
        for(BankEntity entity: List)
        {
            if(entity.getId() == id)
                return BankEntity.mapBankEntityToBankResponseDto(entity);
        }
        return null;
    }

    @Override
    public void deletByID(int id)
    {
        for(BankEntity entity: List)
        {
            if(entity.getId() == id)
                List.remove(entity);
        }
    }
}
