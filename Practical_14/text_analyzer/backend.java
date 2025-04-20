/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package text_analyzer;

/**
 *
 * @author amol
 */
public class backend {
    private String inputtedText;

private int textLength;
private int wordCount;
private int tabCount;
private int spaceCount;
private int lineCount;

    public backend(String inputtedText) {
        this.inputtedText = inputtedText;
        analyzeText();
    }


    public void setTextLength(int textLength) {
        this.textLength = textLength;
    }

    public void setWordCount(int wordCount) {
        this.wordCount = wordCount;
    }

    public void setTabCount(int tabCount) {
        this.tabCount = tabCount;
    }

    public void setSpaceCount(int spaceCount) {
        this.spaceCount = spaceCount;
    }

    public void setLineCount(int lineCount) {
        this.lineCount = lineCount;
    }
    
    public String getTextOrCharCount(String pattern){
        return "";
    }

    public int getTextLength() {
        return textLength;
    }

    public int getWordCount() {
        return wordCount;
    }

    public int getTabCount() {
        return tabCount;
    }

    public int getSpaceCount() {
        return spaceCount;
    }

    public int getLineCount() {
        return lineCount;
    }
    
    
    
    
    
    
    
    private void analyzeText(){
       textLength = inputtedText.length();
       lineCount = textLength>0?inputtedText.split("\n", -1).length :0 ;
       spaceCount = inputtedText.split("\s", -1).length-1;
       tabCount = inputtedText.split("\t", -1).length-1;
       wordCount = inputtedText.split("\s", -1).length;


       
    }
    
    
    
    
    



    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
    backend object = new backend("hello there its me");
        System.out.println(object.textLength + " " + object.lineCount + " " + object.spaceCount + " " + 
                object.tabCount + " " + object.wordCount);
        
    }
    

    
}
