
package kata4;



public class KATA4 {

    public static void main(String[] args) {
        
        Histogram<String>histo = new Histogram<>();
        histo.increment("gmail");
        histo.increment("gmail");
        histo.increment("gmail");
        
        histo.increment("hotmail");
        histo.increment("hotmail");
        histo.increment("hotmail");
        histo.increment("hotmail");
        histo.increment("hotmail");
        histo.increment("hotmail");
        
        histo.increment("ulpgc");
        histo.increment("ulpgc");
        histo.increment("ulpgc");
        histo.increment("ulpgc");
        histo.increment("ulpgc");
        histo.increment("ulpgc");
        histo.increment("ulpgc");
        histo.increment("ulpgc");
        histo.increment("ulpgc");

        
        
        
        new HistogramDisplay(histo).execute();
        
        
        
    }
}
   

