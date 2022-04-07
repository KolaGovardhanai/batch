 class Rectangle{
  private int length;
  private int width;
       

  public void setLength(int l){
   length = l;
  }
   public int getLength(){
   return length;
   }
   public void setWidth(int w){
    width = w;
   }
     public int getWidth(){
      return width;
     }
     public int area(){
      return length*width;
     }
   public static void main(String args[]){
    Rectangle rectangle = new Rectangle();
    rectangle.setLength(4);
    rectangle.setWidth(5);
   System.out.println("Area is "+rectangle.area());
  }
}
  