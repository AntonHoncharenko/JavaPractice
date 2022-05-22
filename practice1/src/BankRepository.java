import java.util.ArrayList;

public class BankRepository
{
    public BankRepository() {}

    ArrayList<BankEntity> List = new ArrayList<BankEntity>();
    public void add(BankEntity  bankEntity)
    {
        List.add(bankEntity);
    }
    public ArrayList<BankEntity> getList()
    {
        return List;
    }
    public void displayList()
    {
        System.out.println("Display bank entities:");
        for(int i = 0; i < List.size(); i++)
        {
            System.out.println(List.get(i).getId() + " " + List.get(i).getName() + " " + List.get(i).getQnt());
        }
    }
}
