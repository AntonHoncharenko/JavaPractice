public class BankService
{
    BankRepository bankRepository;
    public void addToRepository(BankRequestDTO requestDTO)
    {
        bankRepository = new BankRepository();
        BankEntity entity = new BankEntity().mapRequestDTOToEntity(requestDTO);
        bankRepository.add(entity);
    }
}
