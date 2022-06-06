public class BankEntity
{
    private int id;
    private String name;
    private int qnt;

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

    public static BankEntity mapRequestDTOToEntity(BankRequestDTO requestDto)
    {
        if (requestDto == null)
        {
            return null;
        }

        BankEntity bankEntity = new BankEntity();

        bankEntity.setId(requestDto.getId());
        bankEntity.setName(requestDto.getName());
        bankEntity.setQnt(requestDto.getQnt());

        return bankEntity;
    }

    public static BankResponseDTO mapBankEntityToBankResponseDto(BankEntity bankEntity)
    {
        BankResponseDTO bankResponseDto = new BankResponseDTO();
        if (bankEntity == null)
        {
            return null;
        }
        bankResponseDto.setId(bankEntity.getId());
        bankResponseDto.setName(bankEntity.getName());
        bankResponseDto.setQnt(bankEntity.getQnt());

        return bankResponseDto;
    }

    @Override
    public String toString() {
        return "BankEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", qnt=" + qnt +
                '}';
    }
}
