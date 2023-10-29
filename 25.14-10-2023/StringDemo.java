class StringDemo{
    public static void main(String args[]){
        String s="SASTRA UNI SoC";
        boolean blanks=s.contains("\b"); //will search for number of blank spaces
        String s1=s.replaceFirst("SoC","SASTRA");
        String s2=s.replaceAll("SASTRA", "SoC");
        String splits[]=s.split(" ");
        System.out.println("\ns1="+s1+"\ns2="+s2+"\nsplits="+splits+"\ns="+s+"\nblanks="+blanks);
        StringBuffer s3=new StringBuffer("SASTRA");
        System.out.println(s3.length()+s3.capacity());
        s3.ensureCapacity(100);
        for(var i:splits)
            System.out.println(i);
    }
}