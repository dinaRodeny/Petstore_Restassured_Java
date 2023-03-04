package resources;
import Pojo.Category;
import Pojo.petInfo;
import Pojo.tags;
import java.util.ArrayList;
import java.util.List;
public class TestDataBuild
{
    public petInfo addPet(String name, String ID, String CategoryName,String status)
    {
        petInfo p = new  petInfo();
        p.setName(name);
        p.setId(Integer.parseInt(ID));
        Category l =new Category();
        l.setName(CategoryName);
        l.setId(Integer.parseInt(ID));
        p.setCategory(l);
        List<String> photo =new ArrayList<String>();
        photo.add("string");
        p.setPhotoUrls(photo);
        p.setStatus(status);
        List<tags> listt = new ArrayList<tags>();
        for( int i=0;i<4;i++)
        {
            tags temp=new tags(i,"tagnumber ");
            listt.add(temp);
        }
        p.setTags(listt);
        return p;
    }

}
