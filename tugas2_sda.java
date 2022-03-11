
import java.util.LinkedList;

public class tugas2_sda {
    public static void main(String[] args) {

        //akan me createkan nama panjang saya 
        LinkedList <String> saya = new LinkedList<>();
        saya.add("S");
        saya.add("Y");
        saya.add("A");
        saya.add("D");
        saya.add("Z");
        saya.add("A");
        saya.add("");
        saya.add("I");
        saya.add("N");
        saya.add("T");
        saya.add("A");
        saya.add("N");
        saya.add("");
        saya.add("B");
        saya.add("E");
        saya.add("N");
        saya.add("Y");
        saya.add("A");
        System.out.println("Nama Saya\t:"+saya);
        System.out.println("Jumlah\t:"+ saya.size());
        System.out.println("");

        //fungsi add
        saya.addFirst("");    
        saya.addFirst("E");   
        saya.addFirst("E");  
        saya.addFirst("Z");   
        saya.addLast("");
        saya.addLast("T");
        saya.addLast("A");
        saya.addLast("A");
        System.out.println("jawaban soal no 1");
        System.out.println("Huruf yang ditambahankan :"+saya);
        System.out.println("Jumlah :"+saya.size());
        System.out.println("");

        //funsi sisip
        saya.set(0,"S");
        saya.set(13,"N");
        System.out.println("jawaban soal no 2");
        System.out.println("Sisipan nama yang ditambahkan :"+saya);
        System.out.println("Jumlah :"+saya.size());
        System.out.println("");
        
        //fungsi delete/remove
        saya.removeFirst();
        saya.removeLast();
        saya.remove(0);
        saya.remove(0);
        saya.remove(0);
        saya.remove(7);
        saya.remove(7);
        saya.remove(7);
        saya.remove(7);
        saya.remove(8);
        saya.remove(8);
        saya.remove(9);
        saya.remove(9);
        saya.remove(9);
        saya.remove(9);
        System.out.println("jawaban soal no 3");
        System.out.println("Huruf yang akan dihapus :"+saya);
        System.out.println("Jumlah :"+saya.size());
        System.out.println("");

        //fungsi push
        saya.push("");
        saya.push("I");
        saya.push("V");
        System.out.println("jawaban soal no 4.a");
        System.out.println("Huruf yang digunakan untuk menambahkan :"+saya);
        System.out.println("Jumlah :"+saya.size());
        System.out.println("");

        //fungsi pop
        saya.pop();
        saya.pop();
        saya.pop();
        System.out.println("jawaban soal no 4.b");
        System.out.println("Untuk Menghapus item awal :"+saya);
        System.out.println("Jumlah :"+saya.size());
        System.out.println("");

    }
} 