public class BankController
{
    BankServiceImpl bankService;
    public void createBank(BankRequestDTO requestDTO)
    {
        bankService = new BankServiceImpl();
        bankService.addToRepository(requestDTO);
    }
}