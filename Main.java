class Statistics {
  static int COUNT = 0 ;
  public double max(double a, double b) {
    COUNT++;
    if(a>b){
     return a; 
    } else {
      return b;
    } 
    
  }
  public double min(double a, double b) {
    COUNT++;
    if(a<b){
     return a; 
    } else {
      return b;
    } 
    
  }
  public double average(double a, double b, double c){
    double sum = a+b+c;
    COUNT++;
    return (sum/3);
    
  }
  }
}