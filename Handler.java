import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Handler extends DefaultHandler
{
    private AgroService agroService=new AgroService();
    private ArrayList<AgroService> list;
    private boolean isId;
    private boolean isName;
    private boolean isSize;
    private boolean isSalary;
    private boolean isAgrotechol;

    @Override
    public void startDocument() throws SAXException {
        System.out.println("Reading Start!");
        list = new ArrayList<>();
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("Reading Finished!");
        System.out.println("Your Information here :");
        System.out.println(list);
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        System.out.println("Start element: "+qName);
        if (qName.equalsIgnoreCase("agro_service")){
           agroService = new AgroService();
        }
        if (qName.equalsIgnoreCase("id")){
            isId=true;
        }
        else if (qName.equalsIgnoreCase("name")){
            isName =true;

        }
        else if (qName.equalsIgnoreCase("size")){
            isSize=true;

        }
        else if (qName.equalsIgnoreCase("salary")){
            isSalary =true;

        }
        else if (qName.equalsIgnoreCase("agrotechol")){
            isAgrotechol =true;

        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        System.out.println("End element: "+qName);
        if (qName.equalsIgnoreCase("agro_service")){
            list.add(agroService);
            System.out.println("*********");
            System.out.println(agroService);
            agroService=null;
        }
        if (isId){
            isId =false;
        }
        else if(isName){
            isName=false;
        }
        else if (isSize){
            isSize=false;
        }
        else if(isSalary){
            isSalary=false;
        }
        else if(isAgrotechol){
            isAgrotechol=false;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
       String data = new String(ch,start,length);
        System.out.println("Your Data: "+data);
        if (isId){
            try {
                agroService.setId(Integer.valueOf(data));
            }
           catch (NumberFormatException e){
               System.out.println(e.getMessage()+" uygun gelmir");
           }

    }
        else if(isName){
         agroService.setName(data);
        }
        else if (isSize){
                agroService.setSize(data);
        }
        else if(isSalary){
            agroService.setSalary(data);
        }
        else if(isAgrotechol){
            agroService.setAgroTechol(data);

        }

    }
}
