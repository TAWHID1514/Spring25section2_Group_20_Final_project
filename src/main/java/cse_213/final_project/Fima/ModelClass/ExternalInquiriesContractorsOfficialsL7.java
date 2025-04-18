package cse_213.final_project.Fima.ModelClass;

public class ExternalInquiriesContractorsOfficialsL7 {

    public int id, contactinfo;
    public String name, department,InquiriesPurpose;

    public ExternalInquiriesContractorsOfficialsL7(int id, int contactinfo, String name, String department, String inquiriesPurpose) {
        this.id = id;
        this.contactinfo = contactinfo;
        this.name = name;
        this.department = department;
        InquiriesPurpose = inquiriesPurpose;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getContactinfo() {
        return contactinfo;
    }

    public void setContactinfo(int contactinfo) {
        this.contactinfo = contactinfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getInquiriesPurpose() {
        return InquiriesPurpose;
    }

    public void setInquiriesPurpose(String inquiriesPurpose) {
        InquiriesPurpose = inquiriesPurpose;
    }

    @Override
    public String toString() {
        return "ExternalInquiriesContractorsOfficialsL7{" +
                "id=" + id +
                ", contactinfo=" + contactinfo +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", InquiriesPurpose='" + InquiriesPurpose + '\'' +
                '}';
    }
}
