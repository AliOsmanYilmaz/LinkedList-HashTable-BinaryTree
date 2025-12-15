import java.util.Scanner;

class Main
{
    public static void print1()
    {
        System.out.println("Tek Yönlü Bağıl Liste");
        System.out.println("0-) Çıkış");
        System.out.println("1-) Başa ekle");
        System.out.println("2-) Sona ekle");
        System.out.println("3-) Araya ekle");
        System.out.println("4-) Baştan sil");
        System.out.println("5-) Sondan sil");
        System.out.println("6-) Aradan sil");
        System.out.println("7-) Eleman sayısı yazdır");
        System.out.println("8-) Eleman toplamını yazdır");
        System.out.println("9-) Eleman ortalamasını yazdır");
        System.out.print("Seçiminiz : ");
    }


    public static void print2()
    {
        System.out.println("0-) Çıkış");
        System.out.println("1-) Bağıl Liste");
        System.out.println("2-) Ağaç Yapısı");
        System.out.println("3-) Hash Tablosu");
        System.out.print("Seçiminiz : ");
    }



    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int a = -1,b,length,sayi,index;

        System.out.println();
        System.out.println("Uygulamaya Hoş Geldiniz");

        while (a != 0)
        {
            print2();
            a = input.nextInt();

            switch(a)
            {
                case 0:
                    System.out.println("Çıkış yapılıyor...");
                    break;


                case 1:
                    b = -1;
                    while(b != 0){
                        System.out.println("Bağıl Liste");
                        System.out.println("0-) Çıkış");
                        System.out.println("1-) Tek Yönlü Bağıl Liste");
                        System.out.println("2-) Tek Yönlü Dairsel Liste");
                        System.out.println("3-) Çift Yönlü Bağıl Liste");
                        System.out.println("4-) Çift Yönlü Dairsel Liste");
                        System.out.print("Seçiminiz : ");
                        b = input.nextInt();

                        switch(b)
                        {
                            case 0:
                                System.out.println("Bağıl listeden çıkıldı.");
                                break;


                            case 1:
                                TekYonluBagilListe list = new TekYonluBagilListe();

                                while(b != 0)
                                {
                                    print1();
                                    b = input.nextInt();

                                    switch(b)
                                    {
                                        case 0:
                                            System.out.println("Tek Yönlü Bağıl Listeden çıkıldı.");
                                            break;

                                        case 1:
                                            System.out.print("Sayı giriniz : ");
                                            sayi = input.nextInt();

                                            System.out.println();
                                            list.basaEkle(sayi);

                                            System.out.println();
                                            break;

                                        case 2:
                                            System.out.print("Sayı giriniz : ");
                                            sayi = input.nextInt();

                                            System.out.println();
                                            list.sonaEkle(sayi);

                                            System.out.println();
                                            break;

                                        case 3:
                                            System.out.print("İndis giriniz : ");
                                            index = input.nextInt();
                                            System.out.print("Sayı giriniz : ");
                                            sayi = input.nextInt();
                                            list.arayaEkle(index,sayi);
                                            break;

                                        case 4:
                                            list.bastanSil();
                                            System.out.println();
                                            break;

                                        case 5:
                                            list.sondanSil();
                                            System.out.println();
                                            break;

                                        case 6:
                                            System.out.print("İndis giriniz : ");
                                            index = input.nextInt();
                                            System.out.println();

                                            list.aradanSil(index);
                                            System.out.println();
                                            break;

                                        case 7:
                                            System.out.println("Eleman sayısı : " + list.elemanSayisiYazdir());
                                            break;

                                        case 8:
                                            System.out.println("Eleman toplamı : " + list.elemanToplami());
                                            break;

                                        case 9:
                                            System.out.println("Eleman ortlaması : "  + list.elemanOrtDeger());
                                            break;

                                        default:
                                            System.out.println("Hatalı seçim");
                                    }

                                    list.print();
                                }
                                break;


                            case 2:
                                TekYonluDaireselListe list1 = new TekYonluDaireselListe();

                                while(b != 0)
                                {
                                    print1();
                                    b = input.nextInt();

                                    switch(b)
                                    {
                                        case 0:
                                            System.out.println("Tek Yönlü Dairesel Bağıl Listeden çıkıldı.");
                                            break;

                                        case 1:
                                            System.out.print("Sayı giriniz : ");
                                            sayi = input.nextInt();

                                            System.out.println();
                                            list1.basaEkle(sayi);

                                            System.out.println();
                                            break;

                                        case 2:
                                            System.out.print("Sayı giriniz : ");
                                            sayi = input.nextInt();

                                            System.out.println();
                                            list1.sonaEkle(sayi);

                                            System.out.println();
                                            break;

                                        case 3:
                                            System.out.print("İndis giriniz : ");
                                            index = input.nextInt();
                                            System.out.println();
                                            System.out.print("Sayı giriniz : ");
                                            sayi = input.nextInt();

                                            System.out.println();
                                            list1.arayaEkle(index,sayi);

                                            System.out.println();
                                            break;

                                        case 4:
                                            list1.bastanSil();
                                            System.out.println();
                                            break;

                                        case 5:
                                            list1.sondanSil();
                                            System.out.println();
                                            break;

                                        case 6:
                                            System.out.print("İndis giriniz : ");
                                            index = input.nextInt();
                                            System.out.println();

                                            list1.aradanSil(index);
                                            System.out.println();
                                            break;

                                        case 7:
                                            System.out.println("Eleman sayısı : " + list1.elemanSayisiYazdir());
                                            break;

                                        case 8:
                                            System.out.println("Eleman toplamı : " + list1.elemanToplami());
                                            break;

                                        case 9:
                                            System.out.println("Eleman ortlaması : "  + list1.elemanOrtDeger());
                                            break;

                                        default:
                                            System.out.println("Hatalı seçim");
                                    }

                                    list1.print();
                                }
                                break;


                            case 3:
                                CiftYonluBagilListe list2 = new CiftYonluBagilListe();

                                while(b != 0)
                                {
                                    print1();
                                    b = input.nextInt();

                                    switch(b)
                                    {
                                        case 0:
                                            System.out.println("Çift Yönlü Bağıl Listeden çıkıldı.");
                                            break;

                                        case 1:
                                            System.out.print("Sayı giriniz : ");
                                            sayi = input.nextInt();

                                            System.out.println();
                                            list2.basaEkle(sayi);

                                            System.out.println();
                                            break;

                                        case 2:
                                            System.out.print("Sayı giriniz : ");
                                            sayi = input.nextInt();

                                            System.out.println();
                                            list2.sonaEkle(sayi);

                                            System.out.println();
                                            break;

                                        case 3:
                                            System.out.print("İndis giriniz : ");
                                            index = input.nextInt();
                                            System.out.println();
                                            System.out.print("Sayı giriniz : ");
                                            sayi = input.nextInt();

                                            System.out.println();
                                            list2.arayaEkle(index,sayi);

                                            System.out.println();
                                            break;

                                        case 4:
                                            list2.bastanSil();
                                            System.out.println();
                                            break;

                                        case 5:
                                            list2.sondanSil();
                                            System.out.println();
                                            break;

                                        case 6:
                                            System.out.print("İndis giriniz : ");
                                            index = input.nextInt();
                                            System.out.println();

                                            list2.aradanSil(index);
                                            System.out.println();
                                            break;

                                        case 7:
                                            System.out.println("Eleman sayısı : " + list2.elemanSayisiYazdir());
                                            break;

                                        case 8:
                                            System.out.println("Eleman toplamı : " + list2.elemanToplami());
                                            break;

                                        case 9:
                                            System.out.println("Eleman ortlaması : "  + list2.elemanOrtDeger());
                                            break;

                                        default:
                                            System.out.println("Hatalı seçim");
                                    }

                                    System.out.print("Baştan : ");
                                    list2.yazdir();
                                    System.out.print("Sondan : ");
                                    list2.sondanYazdir();
                                }
                                break;


                            case 4:
                                CiftYonluDaireselListe list3 = new CiftYonluDaireselListe();

                                while(b != 0)
                                {
                                    print1();
                                    b = input.nextInt();

                                    switch(b)
                                    {
                                        case 0:
                                            System.out.println("Çift Yönlü Dairesel Bağıl Listeden çıkıldı.");
                                            break;

                                        case 1:
                                            System.out.print("Sayı giriniz : ");
                                            sayi = input.nextInt();

                                            System.out.println();
                                            list3.basaEkle(sayi);

                                            System.out.println();
                                            break;

                                        case 2:
                                            System.out.print("Sayı giriniz : ");
                                            sayi = input.nextInt();

                                            System.out.println();
                                            list3.sonaEkle(sayi);

                                            System.out.println();
                                            break;

                                        case 3:
                                            System.out.print("İndis giriniz : ");
                                            index = input.nextInt();
                                            System.out.println();
                                            System.out.print("Sayı giriniz : ");
                                            sayi = input.nextInt();

                                            System.out.println();
                                            list3.arayaEkle(index,sayi);

                                            System.out.println();
                                            break;

                                        case 4:
                                            list3.bastanSil();
                                            System.out.println();
                                            break;

                                        case 5:
                                            list3.sondanSil();
                                            System.out.println();
                                            break;

                                        case 6:
                                            System.out.print("İndis giriniz : ");
                                            index = input.nextInt();
                                            System.out.println();

                                            list3.aradanSil(index);
                                            System.out.println();
                                            break;

                                        case 7:
                                            System.out.println("Eleman sayısı : " + list3.elemanSayisiYazdir());
                                            break;

                                        case 8:
                                            System.out.println("Eleman toplamı : " + list3.elemanToplami());
                                            break;

                                        case 9:
                                            System.out.println("Eleman ortlaması : "  + list3.elemanOrtDeger());
                                            break;

                                        default:
                                            System.out.println("Hatalı seçim");
                                    }

                                    System.out.print("Baştan : ");
                                    list3.yazdir();
                                    System.out.print("Sondan : ");
                                    list3.sondanYazdir();
                                }
                                break;

                            default:
                                System.out.println("Hatalı seçim");
                        }
                    }
                    break;




                case 2:
                    Tree t1 = new Tree();
                    b = -1;

                    while(b != 0)
                    {
                        System.out.println("Ağaç Yapısı");
                        System.out.println("0-) Çıkış");
                        System.out.println("1-) Ekle");
                        System.out.println("2-) Sil");
                        System.out.println("3-) Eleman ara");
                        System.out.println("4-) Preorder yazdır");
                        System.out.println("5-) Inorder yazdır");
                        System.out.println("6-) Postorder yazdır");
                        System.out.println("7-) Yükseklik yazdır");
                        System.out.println("8-) Eleman sayısı yazdır");
                        System.out.print("Seçiminiz : ");
                        b = input.nextInt();

                        switch(b)
                        {
                            case 0:
                                System.out.println("Ağaç yapısından çıkıldı.");
                                break;

                            case 1:
                                System.out.print("Eklemek için bir sayı giriniz : ");
                                sayi = input.nextInt();
                                t1.root = t1.insert(t1.root,sayi);
                                break;

                            case 2:
                                System.out.print("Silmek için bir sayı giriniz : ");
                                sayi = input.nextInt();
                                t1.root = t1.delete(t1.root,sayi);
                                break;

                            case 3:
                                System.out.print("Aramak için bir sayı giriniz : ");
                                sayi = input.nextInt();

                                if(t1.search(t1.root,sayi))
                                {
                                    System.out.println(sayi + " ağaçta bulunuyor");
                                }

                                else
                                {
                                    System.out.println(sayi + " ağaçta bulunmuyor");
                                }
                                break;

                            case 4:
                                System.out.print("Preorder : ");
                                t1.preOrder(t1.root);
                                System.out.println();
                                break;

                            case 5:
                                System.out.print("Inorder : ");
                                t1.inOrder(t1.root);
                                System.out.println();
                                break;

                            case 6:
                                System.out.print("Postorder : ");
                                t1.postOrder(t1.root);
                                System.out.println();
                                break;

                            case 7:
                                System.out.println("Yükseklik : " + t1.height(t1.root));
                                break;

                            case 8:
                                System.out.println("Eleman sayısı : " + t1.sizeOfTree(t1.root));
                                break;

                            default:
                                System.out.println("Hatalı seçim.");
                        }
                    }
                    break;



                case 3:

                    System.out.print("Hash tablosunun uzunluğu : ");
                    length = input.nextInt();
                    HashTable ht = new HashTable(length);
                    b = -1;

                    while(b != 0)
                    {
                        System.out.println("Hash Tablosu");
                        System.out.println("0-) Çıkış");
                        System.out.println("1-) Ekle");
                        System.out.println("2-) Sil");
                        System.out.println("3-) Yazdır");
                        System.out.print("Seçiminiz : ");
                        b = input.nextInt();

                        switch(b)
                        {
                            case 0:
                                System.out.println("Hash Tablosundan çıkıldı.");
                                break;

                            case 1:
                                System.out.print("EKlemek için sayı giriniz : ");
                                sayi = input.nextInt();
                                ht.ekle(ht.mod(sayi),sayi);
                                break;

                            case 2:
                                System.out.print("Silmek için sayı giriniz : ");
                                sayi = input.nextInt();
                                ht.sil(sayi);
                                break;

                            case 3:
                                ht.yazdir();
                                break;

                            default:
                                System.out.println("Hatalı seçim.");
                        }
                    }
                    break;


                default:
                    System.out.println("Hatalı seçim");
            }
        }
    }
}

//Classlar
//--------------------------------------------------------------------------------------------


/*Hash Table*/
/* 570-702 */
class HashNode
{
    int sayi;
    int key;
    HashNode next;

    public HashNode()
    {
        next = null;
    }

    public HashNode(int key,int sayi)
    {
        this.sayi = sayi;
        this.key = key;
        next = null;
    }
}


class HashTable
{
    int size;
    HashNode[] dizi;

    public HashTable(int size)
    {
        dizi = new HashNode[size];
        this.size = size;

        for (int i = 0; i < size; i++)
        {
            dizi[i] = new HashNode();
        }
    }


    public int mod(int key)
    {
        return key % size;
    }



    public void ekle(int key, int sayi)
    {
        int index = mod(key);
        HashNode eleman = new HashNode(key,sayi);
        HashNode current = dizi[index];

        while (current.next != null)
        {
            current = current.next;
        }

        current.next = eleman;
    }



    public void sil(int key)
    {
        boolean sonuc = false;
        int index = mod(key);
        HashNode current = dizi[index];
        HashNode current1 = dizi[index];

        if(current.next == null)
        {
            sonuc = true;
            System.out.println(key + " numaralı değer yok.");
        }

        else if(current.next.next == null && current.next.sayi == key)
        {
            sonuc = true;
            System.out.println(current.next.sayi + " silindi.Liste boşaltıldı.");
            current.next = null;
        }

        else
        {
            while(current.next != null)
            {
                current1 = current;
                current = current.next;

                if(current.sayi == key)
                {
                    sonuc = true;
                    System.out.println(key + " silindi.");
                    current1.next = current.next;
                }
            }
        }

        if(sonuc == false)
        {
            System.out.println(key + " değeri bulunmuyor.");
        }
    }





    public void yazdir()
    {
        for (int i = 0; i < size; i++)
        {
            HashNode current = dizi[i];

            System.out.print("Dizi[" + i + "] -> " );

            if(current.next != null)
            {
                while(current.next != null)
                {
                    System.out.print(current.next.sayi + " -> ");
                    current = current.next;
                }

                System.out.println();
            }

            else{
                System.out.println();
            }
        }
    }
}
/*Hash Table*/


//--------------------------------------------------------------------------------------------



/*Binary Tree*/
/* 710-890 */
class TreeNode
{
    int data;
    TreeNode left,right;

    public TreeNode(int data)
    {
        this.data = data;
        left=right=null;
    }
}




class Tree
{
    TreeNode root;

    //Ekleme
    public TreeNode newNode(int data) {
        root = new TreeNode(data);
        return root;
    }


    public TreeNode insert(TreeNode root, int data) {
        if (root == null) {
            root = new TreeNode(data);
            return root;
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }

        return root;
    }


    //Sıralama
    public void preOrder(TreeNode root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }


    public void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }


    public void postOrder(TreeNode root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }


    public int height(TreeNode root) {
        int left;
        int right;

        if (root == null) {
            return 0;
        } else {
            left = height(root.left);
            right = height(root.right);

            if (left > right) {
                return left + 1;
            } else {
                return right + 1;
            }
        }
    }


    public int sizeOfTree(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return 1 + sizeOfTree(root.left) + sizeOfTree(root.right);
        }
    }


    public boolean search(TreeNode root, int data) {
        if (root == null) {
            return false;
        }

        if (data == root.data) {
            return true;
        } else if (data < root.data) {
            return search(root.left, data);
        } else {
            return search(root.right, data);
        }
    }


    public TreeNode delete(TreeNode root, int data)
    {
        TreeNode t1, t2;

        if (root == null)
        {
            System.out.println("Ağaç boş.");
            return null;
        }

        if (root.data == data) {

            if (root.left == root.right)
            {
                return null;
            }

            else if (root.left == null)
            {
                t1 = root.right;
                return t1;
            }

            else if (root.right == null)
            {
                t1 = root.left;
                return t1;
            }

            else
            {
                t1 = root.right;
                t2 = root.right;


                while (t1.left != null)
                {
                    t1 = t1.left;
                }

                t1.left = root.left;

                return t2;
            }
        }

        else
        {
            if (data < root.data)
            {
                root.left = delete(root.left, data);
            }

            else
            {
                root.right = delete(root.right, data);
            }
        }

        return root;
    }


}
/*Binary Tree*/




//--------------------------------------------------------------------------------------------




/*Linked List*/
/* 900-1160 Tek Yönlü Bağıl Liste */
/* 1168-1507 Tek Yönlü Bağıl Liste */
/* 1525-1874 Tek Yönlü Bağıl Liste */
/* 1890-2254 Tek Yönlü Bağıl Liste */

//Tek yönlü bağıl liste
class Node
{
    int data;
    Node next;

    public Node(int data)
    {
        this.data = data;
        next = null;
    }
}


class TekYonluBagilListe
{
    Node head;

    public void basaEkle(int data)
    {
        Node newNode = new Node(data);

        if(head == null)
        {
            head = newNode;
        }

        else
        {
            newNode.next = head;
            head = newNode;
        }
    }


    public void sonaEkle(int data)
    {
        Node newNode = new Node(data);

        if(head == null)
        {
            head = newNode;
        }

        else
        {
            Node current = head;

            while(current.next != null)
            {
                current = current.next;
            }

            current.next = newNode;
        }
    }



    public void arayaEkle(int index , int data)
    {
        Node newNode = new Node(data);

        if (head == null)
        {
            head = newNode;
        }

        else if(index <= 0)
        {
            newNode.next = head;
            head = newNode;
        }

        else
        {
            Node current = head;
            Node current1;
            int n = 0;

            while(current.next != null)
            {
                n++;
                current = current.next;
            }
            n++;


            if(index >= n)
            {
                current.next = newNode;
            }

            else
            {
                current = head;
                current1 = current;
                int i = 0;

                while(i != index)
                {
                    i++;
                    current1 = current;
                    current = current.next;
                }

                current1.next = newNode;
                newNode.next = current;
            }
        }
    }






    public void bastanSil()
    {
        if(head == null)
        {
            System.out.println("liste boş");
        }


        else
        {
            head = head.next;
        }
    }



    public void sondanSil()
    {
        if(head == null)
        {
            System.out.println("liste boş");
        }


        else if(head.next == null)
        {
            head = null;
        }


        else
        {
            Node current = head;

            while (current.next.next != null)
            {
                current = current.next;
            }

            current.next = null;
        }
    }



    public void aradanSil(int index)
    {
        if(head == null)
        {
            System.out.println("Liste boş");
        }

        else if(head.next == null)
        {
            head = null;
        }

        else if (index <= 0)
        {
            head = head.next;
        }

        else
        {
            Node current = head;
            Node current1 = current;
            int n = 0;

            while(current.next != null)
            {
                n++;
                current1 = current;
                current = current.next;
            }
            n++;

            if(index >= n)
            {
                current1.next = null;
            }

            else
            {
                current = head;
                current1 = current;
                int i = 0;

                while(index != i)
                {
                    i++;
                    current1 = current;
                    current = current.next;
                }

                current1.next = current.next;
            }
        }

    }





    public int elemanSayisiYazdir()
    {
        Node current = head;
        int a = 0;
        while(current != null)
        {
            current = current.next;
            a++;
        }

        return a;
    }


    public int elemanToplami()
    {
        Node current = head;
        int toplam = 0;

        while(current != null)
        {
            toplam = toplam + current.data;
            current = current.next;
        }

        return toplam;

    }

    public float elemanOrtDeger()
    {
        if(head == null)
        {
            return 0;
        }
        float ort;
        ort = (float) elemanToplami() / elemanSayisiYazdir();
        return ort;
    }



    public void print()
    {
        if(head == null)
        {
            System.out.println("Liste boş");
        }

        else
        {
            System.out.print("Baş --> ");
            Node current = head;

            while(current.next != null)
            {
                System.out.print(current.data + " --> ");
                current = current.next;
            }

            System.out.println(current.data + " --> Son");
        }
    }
}




//-----------------------------------------------------------------------------------------




//Tek Yönlü Dairesel Liste
class Node1
{
    int data;
    Node1 next;

    public Node1(int data)
    {
        this.data = data;
        next = null;
    }
}


class TekYonluDaireselListe
{
    Node1 head;
    Node1 tail;


    public void basaEkle(int data)
    {
        Node1 newNode = new Node1(data);

        if (head == null)
        {
            head = newNode;
            tail = newNode;
            tail.next = head;
        }


        else
        {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
    }





    public void sonaEkle(int data)
    {
        Node1 newNode= new Node1(data);

        if (head == null)
        {
            head = newNode;
            tail = newNode;
            tail.next = head;
        }

        else
        {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }





    public void arayaEkle(int index,int data)
    {
        Node1 newNode = new Node1(data);

        if(head == null)
        {
            head = newNode;
            tail = newNode;
            tail.next = head;
        }

        //Başa ekle
        else if(index <= 0)
        {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }

        else
        {
            int n = 0;
            Node1 current = head;
            Node1 current1;

            while(current != tail)
            {
                current = current.next;
                n++;
            }
            n++;


            //Kuyruğa ekle
            if(index >= n)
            {
                tail.next = newNode;
                tail = newNode;
                tail.next = head;
            }


            else
            {
                current = head;
                current1 = current;
                int i = 0;

                while (index != i)
                {
                    i++;
                    current1 = current;
                    current = current.next;
                }

                current1.next = newNode;
                newNode.next = current;

            }
        }
    }









    public void bastanSil()
    {
        if(head == null)
        {
            System.out.println("Liste boş. Silmek için ilk önce eleman ekleyiniz.");
        }


        else if (head == tail)
        {
            head = null;
            tail = null;
        }

        else
        {
            head = head.next;
            tail.next = head;
        }

    }



    public void sondanSil()
    {
        if(head == null)
        {
            System.out.println("Liste boş. Silmek için ilk önce eleman ekleyiniz.");
        }


        else if (head == tail)
        {
            head = null;
            tail = null;
        }


        else
        {
            Node1 current = head;

            while(current.next != tail)
            {
                current = current.next;
            }

            current.next = head;
            tail = current;
            //tail.next = head;
        }

    }




    public void aradanSil(int index)
    {
        if(head == null)
        {
            System.out.println("Liste boş. Silmek için ilk önce eleman ekleyiniz.");
        }

        else if(head == tail)
        {
            head = null;
            tail = null;
        }


        //Baştan sil
        else if(index <= 0)
        {
            head = head.next;
            tail.next = head;
        }


        else
        {
            Node1 current = head;
            Node1 current1 = current;
            int n = 0;

            while(current != tail)
            {
                current = current.next;
                n++;
            }


            //Sondan sil
            if(index >= n)
            {
                current = head;

                while(current.next != tail)
                {
                    current = current.next;
                }

                tail = current;
                tail.next = head;
            }


            n++;


            current = head;
            int i = 0;

            while (i < index)
            {
                current1 = current;
                current = current1.next;
                i++;
            }

            current1.next = current.next;
        }
    }









    public int elemanSayisiYazdir()
    {
        if(head == null)
        {
            return 0;
        }

        Node1 current = head;
        int a = 0;
        while(current != tail)
        {
            current = current.next;
            a++;
        }
        a++;

        return a;
    }



    public int elemanToplami()
    {
        if(head == null)
        {
            return 0;
        }

        Node1 current = head;
        int toplam = 0;

        while(current != tail)
        {
            toplam = toplam + current.data;
            current = current.next;
        }

        toplam = toplam + current.data;
        return toplam;
    }



    public float elemanOrtDeger()
    {
        if(head == null)
        {
            return 0;
        }

        float ortDeger;

        ortDeger = (float) elemanToplami() / elemanSayisiYazdir();

        return ortDeger;
    }






    public void print()
    {
        if (head == null)
        {
            System.out.println("Liste boş.");
        }

        else
        {
            Node1 temp = head;

            System.out.print("Baş --> ");
            while (temp != tail)
            {
                System.out.print(temp.data + " --> ");
                temp = temp.next;
            }
            System.out.println(temp.data + " --> Son");
        }
    }

}
//Tek Yönlü Dairesel Liste







//-----------------------------------------------------------------------------------------









//Çift Yönlü Bağıl Liste
class Node2
{
    int data;
    Node2 next;
    Node2 prev;

    Node2(int data)
    {
        this.data = data;
        next = null;
        prev = null;

    }

}


class CiftYonluBagilListe
{
    Node2 head;
    Node2 tail;

    public void basaEkle(int data)
    {
        Node2 newNode = new Node2(data);

        if(head == null)
        {
            head = newNode;
            tail = newNode;
        }


        else
        {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            newNode.prev = null;
        }
    }





    public void sonaEkle(int data)
    {
        Node2 newNode = new Node2(data);

        if(head == null)
        {
            head = newNode;
            tail = newNode;
        }


        else
        {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            newNode.next = null;
        }


    }





    public void arayaEkle(int index,int data)
    {
        Node2 newNode = new Node2(data);

        if(head == null)
        {
            head = newNode;
            tail = newNode;
        }

        //Başa ekle
        else if(index <= 0 )
        {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            newNode.prev = null;
        }

        else
        {
            int n = 0;
            Node2 current = head;

            while(current.next != null)
            {
                current = current.next;
                n++;
            }


            //Sona ekle
            if(index >= n)
            {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
                newNode.next = null;
            }

            else
            {
                current = head;
                int i = 0;

                while(i != index)
                {
                    current = current.next;
                    i++;
                }

                newNode.prev = current.prev;
                current.prev.next = newNode;
                newNode.next = current;
                current.prev = newNode;
            }
        }
    }







    public void bastanSil()
    {
        if (head == null)
        {
            System.out.println("Liste boş");
        }

        else if (head == tail)
        {
            head = null;
            tail = null;
        }

        else
        {
            head = head.next;
            head.prev = null;
        }


    }




    public void sondanSil()
    {
        if (head == null)
        {
            System.out.println("Liste boş");
        }

        else if (head == tail)
        {
            head = null;
            tail = null;
        }

        else
        {
            tail = tail.prev;
            tail.next = null;
        }
    }




    public void aradanSil(int index)
    {
        if(head != null)
        {
            if(head.next == null /*&& index <= 0*/)
            {
                head = null;
                tail = null;
            }

            //Baştan sil
            else if (head.next != null && index <= 0)
            {
                head = head.next;
                head.prev = null;
            }


            else
            {
                Node2 current = head;
                int n = 0;

                while(current != null)
                {
                    current = current.next;
                    n++;
                }

                if(index >= (n - 1))
                {
                    tail = tail.prev;
                    tail.next = null;
                }

                else
                {
                    current = head;
                    int i = 0;
                    while(i < index)
                    {
                        current = current.next;
                        i++;
                    }

                    current.next.prev = current.prev;
                    current.prev.next = current.next;
                }
            }
        }


        else
        {
            System.out.println("Liste boş.");
        }
    }








    public int elemanSayisiYazdir()
    {
        Node2 current = head;
        int a = 0;

        while(current != null)
        {
            current = current.next;
            a++;
        }

        return a;
    }



    public int elemanToplami()
    {
        Node2 current = head;
        int toplam = 0;

        while(current != null)
        {
            toplam = toplam + current.data;
            current = current.next;
        }

        return toplam;
    }



    public float elemanOrtDeger()
    {
        if(head == null)
        {
            return 0;
        }

        float ortDeger = 0;

        ortDeger = (float) elemanToplami() / elemanSayisiYazdir();

        return ortDeger;
    }









    public void yazdir()
    {
        if(head == null)
        {
            System.out.println("Liste boş");
        }

        else
        {
            Node2 current = head;
            System.out.print("Baş --> ");

            while(current.next != null)
            {
                System.out.print(current.data + " --> ");
                current = current.next;
            }

            System.out.println(current.data + " --> Son");

        }

    }



    public void sondanYazdir()
    {
        if(head == null)
        {
            System.out.println("Liste boş");
        }


        else
        {
            Node2 current = tail;
            System.out.print("Son --> ");

            while(current.prev != null)
            {
                System.out.print(current.data + " --> ");
                current = current.prev;
            }

            System.out.println(current.data + " --> Baş");
        }
    }
}
//Çift Yönlü Bağıl Liste






//-----------------------------------------------------------------------------------------




//Çift Yönlü Dairesel Liste
class Node3
{
    int data;
    Node3 next;
    Node3 prev;

    public Node3(int data)
    {
        this.data = data;
        next = null;
        prev = null;
    }
}

class CiftYonluDaireselListe
{
    Node3 head;
    Node3 tail;

    public void basaEkle(int data)
    {
        Node3 newNode = new Node3(data);

        if(head == null)
        {
            head = newNode;
            tail = newNode;
            tail.next = head;
            tail.prev = head;
            head.next = tail;
            head.prev = tail;
        }

        else
        {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
            head.prev = tail;
            tail.next = head;
        }

    }





    public void sonaEkle(int data)
    {
        Node3 newNode = new Node3(data);

        if(head == null)
        {
            head = newNode;
            tail = newNode;
            tail.next = head;
            tail.prev = head;
            head.next = tail;
            head.prev = tail;
        }

        else
        {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            tail.next = head;
            head.prev = tail;
        }
    }





    public void arayaEkle(int index,int data)
    {
        Node3 newNode = new Node3(data);

        if(head == null)
        {
            head = newNode;
            tail = newNode;
            tail.next = head;
            tail.prev = head;
            head.next = tail;
            head.prev = tail;
        }

        //Başa ekle
        else if (index <= 0)
        {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
            head.prev = tail;
            tail.next = head;
        }


        else
        {
            Node3 current  = head;
            Node3 current1  = current;
            int n = 0;

            while(current != tail)
            {
                current  = current.next;
                n++;
            }

            current = head;
            int i = 0;

            while(i < index)
            {
                current1  = current;
                current  = current.next;
                i++;
            }

            //Sona ekle
            if(index > n)
            {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
                tail.next = head;
                head.prev = tail;
            }


            else
            {
                current1.next = newNode;
                newNode.prev = current1;
                newNode.next = current;
                current.prev = newNode;
            }


        }
    }







    public void bastanSil()
    {
        if(head == null)
        {
            System.out.println("liste boş");
        }

        else if(head == tail)
        {
            head = null;
            tail = null;
        }

        else
        {
            head = head.next;
            head.prev = tail;
            tail.next = head;
        }
    }




    public void sondanSil()
    {
        if(head == null)
        {
            System.out.println("liste boş");
        }

        else if(head == tail)
        {
            head = null;
            tail = null;
        }

        else
        {
            tail = tail.prev;
            tail.next = head;
            head.prev = tail;
        }
    }




    public void aradanSil(int index)
    {
        if(head == null)
        {
            System.out.println("liste boş");
        }

        else
        {
            if(head == tail && index <= 0)
            {
                head = null;
                tail = null;
            }

            //Baştan sil
            else if (index <= 0)
            {
                head = head.next;
                head.prev = tail;
                tail.next = head;
            }

            else
            {
                int n = 0;
                Node3 current  = head;

                while(current != tail)
                {
                    current  = current.next;
                    n++;
                }


                //Sondan sil
                if(index >= n)
                {
                    tail = tail.prev;
                    tail.next = head;
                    head.prev = tail;
                }

                //Aradan Sil
                else
                {
                    current = head;
                    Node3 current1 = current;
                    int i = 0;

                    while (i < index)
                    {
                        current1 = current;
                        current  = current.next;
                        i++;
                    }

                    current1.next = current.next;
                    current.next.prev = current1;
                }
            }
        }
    }







    public int elemanSayisiYazdir()
    {
        if(head == null)
        {
            return 0;
        }
        Node3 current = head;
        int a = 0;
        while(current != tail)
        {
            current = current.next;
            a++;
        }
        a++;

        return a;
    }



    public int elemanToplami()
    {
        if(head == null)
        {
            return 0;
        }

        Node3 current = head;
        int toplam = 0;

        while(current != tail)
        {
            toplam = toplam + current.data;
            current = current.next;
        }

        toplam = toplam + current.data;
        return toplam;
    }



    public float elemanOrtDeger()
    {
        if(head == null)
        {
            return 0;
        }

        float ortDeger;

        ortDeger = (float) elemanToplami() / elemanSayisiYazdir();

        return ortDeger;
    }







    public void yazdir()
    {
        if(head == null)
        {
            System.out.println("Liste boş");
        }

        else
        {
            Node3 temp = head;

            System.out.print("Baş --> ");
            while (temp != tail)
            {
                System.out.print(temp.data + " --> ");
                temp = temp.next;
            }
            System.out.println(temp.data + " --> Son");

        }
    }


    public void sondanYazdir()
    {
        if(head == null)
        {
            System.out.println("Liste boş");
        }

        else
        {
            Node3 temp = tail;

            System.out.print("Baş --> ");
            while (temp != head)
            {
                System.out.print(temp.data + " --> ");
                temp = temp.prev;
            }
            System.out.println(temp.data + " --> Son");

        }
    }
}
//Çift Yönlü Dairesel Liste

/*Linked List*/
