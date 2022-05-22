public class BankResponseDTO
{
    int id;
    String name;
    int qnt;

    public void setId(int id){
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setQnt(int qnt) {
        this.qnt = qnt;
    }
    public int getQnt() {
        return qnt;
    }
}
