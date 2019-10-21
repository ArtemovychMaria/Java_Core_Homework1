public class Rectangle {
   int length;
   int width;


   public Rectangle(){
       this.length=4;
       this.width=3;
    }

    public Rectangle(int length1,int width1){
       this.length=length1;
       this.width=width1;
    }

   public int Square(int length,int width){
       return length*width;
   }

   public int Perimetr(int length,int width){
       return 2*(length+width);
   }


}
