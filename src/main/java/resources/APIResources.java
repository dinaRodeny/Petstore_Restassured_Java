package resources;

//Enm is special class in jva which has collection of constant or method
public enum APIResources
{
    AddPetAPI("/pet"),
    GetPetByIDAPI("/pet"),
    GetAllPetsAPI("/pet/findByStatus"),
    UpdatePetAPI("/pet"),
    DeletePetAPI("/pet");
    //constructor to call the variable inside the Enum
    private String resource;
    APIResources(String resource)
    {
        this.resource=resource;
    }
    public String getResource()
    {

        return  resource;
    }

}
