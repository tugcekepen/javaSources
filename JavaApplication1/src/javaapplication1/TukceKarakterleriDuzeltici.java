
public class TukceKarakterleriDuzeltici {
    public static void main(String[] args) {
        String giris = """
                       //karakter değişimi yapılması istenen metin
                       """;
        char[] oldChars = {'ı', 'ü', 'ö', 'ş', 'ç', 'ğ', 'İ', 'Ü', 'Ö', 'Ş', 'Ç'};
        char[] newChars = {'i', 'u', 'o', 's', 'c', 'g', 'I', 'U', 'O', 'S', 'C'};
        for (int i = 0; i < oldChars.length; i++) {
            giris = giris.replace(oldChars[i], newChars[i]);
        }
        /*
        giris = giris.replace('ı', 'i');
        giris = giris.replace('ü', 'u');
        giris = giris.replace('ö', 'o');
        giris = giris.replace('ş', 's');
        giris = giris.replace('ç', 'c');
        giris = giris.replace('ğ', 'g');
        giris = giris.replace('İ', 'I');
        giris = giris.replace('Ü', 'U');
        giris = giris.replace('Ö', 'O');
        giris = giris.replace('Ş', 'S');
        giris = giris.replace('Ç', 'C');
        */
        System.out.println(giris);
    }
}
