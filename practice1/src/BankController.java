public class BankController
{
    BankService bankService;
    public void createBank(BankRequestDTO requestDTO)
    {
        bankService = new BankService();
        bankService.addToRepository(requestDTO);
    }
}
