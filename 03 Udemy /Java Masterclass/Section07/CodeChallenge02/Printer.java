public class Printer {

    // Attributes
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    // Constructor
    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel > -1  && tonerLevel <= 100) {             //   Determines what the tonerLevel will be by the
            this.tonerLevel = tonerLevel;                       // criteria we set here... basically keeping the
                                                                // cartridge within the realm of percentages
        } else {
            this.tonerLevel = -1;
        }

        this.duplex = duplex;                                   //   Duplex means both sides of the sheet of paper can
                                                                // can be printed on.  This will determine how many
                                                                // sheets of paper are used when we calculate printed
                                                                // paper in the following method

        this.pagesPrinted = 0;                                  //   Starting our count of pages used at zero
    }

    // Getter
    public int getPagesPrinted() {
        return pagesPrinted;
    }

    // Meths
    public int addToner(int tonerAmount) {
        if(tonerAmount > 0 && tonerAmount < 100) {                  //   We had a greater equals comparison between
                                                                    // tonerAmount and zero.  The equals sing was
                                                                    // causing a lot of problems for us.  Also, I need
                                                                    // literally say "greater" and "less" than when I
                                                                    // type out these statements.  I ALWAYS get them
                                                                    // backwards when I just read them in my head.
                                                                    // Maybe I've got a little dyslexic going on...
            if(this.tonerLevel + tonerAmount > 100) {               //   Next we check to see if the sum of tonerLevel
                return -1;                                          // and tonerAmount will be over the 100 mark
            } else {
            this.tonerLevel += tonerAmount;                         //   If all is good we add the level to the amount
            return this.tonerLevel;                                 // and return the sum
            }
        } else {
            return -1;
        }
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if(this.duplex) {
            pagesToPrint = (pages / 2) + (pages % 2);                   //   Because five pages would be a total of
            System.out.println("Printing in duplex mode");              // three sheets of paper, not two
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }
}










