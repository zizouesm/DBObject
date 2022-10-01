package ir.maktab.model;

public class Person implements IEntity<Long> {
    private Long id;
    private String nationalCode;

    @Override
    public void setId(Long id) {
        this.id =id;
    }

    @Override
    public Long getId() {
        return id;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }
}
