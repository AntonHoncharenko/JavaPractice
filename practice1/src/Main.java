import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        BankRequestDTO requestDTO = new BankRequestDTO();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter id:");
        int id = in.nextInt();
        requestDTO.setId(id);
        System.out.println("Enter name:");
        in.nextLine();
        String name = in.nextLine();
        requestDTO.setName(name);
        System.out.println("Enter quantity:");
        int qnt = in.nextInt();
        requestDTO.setQnt(qnt);


        BankController bankController = new BankController();
        bankController.createBank(requestDTO);

        BankRepository bankRepository = bankController.bankService.bankRepository;
        bankRepository.displayList();
    }
}