class celsiusfah{
    public static void main(String[] args) {
        int cel=45;
        int fah=56;
        celsiustofarenhit(cel);
        farenhittocelsius(fah);
    }
    public static void celsiustofarenhit(int cel){
        int F=(9*cel/5)+32;
        System.out.println("farenhit="+F);
    }
    public static void farenhittocelsius(int fah){
        int C=5*(fah-32)/9;
        System.out.println("celsius="+C);
    }
}