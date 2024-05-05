public class kieuString {
    public static void main(String[] args) {
        String s = "    Hồi đó tôi chê mồm em rộng" +
                "\n Không tin hai đứa chập mồm đo";
//        System.out.println(s);

        StringBuilder st = new StringBuilder();

        st.append("dcmmm");
        st.delete(0,1);
        st.insert(0,"   ");
        String s12 = s.replace(" ", "");
        System.out.println(s12);
        System.out.println(st.substring(4));
        System.out.println(st.length());
        System.out.println(st.indexOf("c"));
    }
}
