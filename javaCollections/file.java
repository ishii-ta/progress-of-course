public class file {
    public static void main(String[] args) throws Exception{
        FileRader fr=new FileReader("test.txt");
        int ch=0;
        int count=0;
        while((ch=fr.read())!=-1){
            char c=Character.toLowerCase((char) ch);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                count++;
            }
        }
        System.out.println(count);
        fr.close();
    }
}
