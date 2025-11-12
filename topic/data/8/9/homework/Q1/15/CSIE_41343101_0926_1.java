public class CSIE_41343101_0926_1 {
    public static void main(String[] args) {
        String name = "王薇詒"; 
        String school = "虎科大"; 
        System.out.println("姓名:" + name); 
        System.out.println("學校:" + school);

        System.out.println("\n姓名 Unicode 內碼:");
        pc(name); 
        System.out.println("\n學校 Unicode 內碼:");
        pc(school);

    }

    public static void pc(String text) {
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            System.out.printf("%c：%04X\n", ch, (int) ch);
        }
    }
}
