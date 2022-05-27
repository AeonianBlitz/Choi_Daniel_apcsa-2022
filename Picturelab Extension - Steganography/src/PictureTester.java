/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("C:\\Users\\Aeoni\\Desktop\\APCSA_Units_2022\\Choi_Daniel_apcsa-2022\\Unit 16\\src\\images\\beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  public static void testKeepOnlyBlue()
  {
    Picture beach = new Picture("C:\\Users\\Aeoni\\Desktop\\APCSA_Units_2022\\Choi_Daniel_apcsa-2022\\Unit 16\\src\\images\\beach.jpg");
    beach.explore();
    beach.keepOnlyBlue();
    beach.explore();
  }

  public static void testKeepOnlyRed()
  {
    Picture beach = new Picture("C:\\Users\\Aeoni\\Desktop\\APCSA_Units_2022\\Choi_Daniel_apcsa-2022\\Unit 16\\src\\images\\beach.jpg");
    beach.explore();
    beach.keepOnlyRed();
    beach.explore();
  }
  
  public static void testKeepOnlyGreen()
  {
    Picture beach = new Picture("C:\\Users\\Aeoni\\Desktop\\APCSA_Units_2022\\Choi_Daniel_apcsa-2022\\Unit 16\\src\\images\\beach.jpg");
    beach.explore();
    beach.keepOnlyGreen();
    beach.explore();
  }
  
  public static void testNegate()
  {
    Picture beach = new Picture("C:\\Users\\Aeoni\\Desktop\\APCSA_Units_2022\\Choi_Daniel_apcsa-2022\\Unit 16\\src\\images\\beach.jpg");
    beach.explore();
    beach.negate();
    beach.explore();
  }
  
  public static void testGrayscale()
  {
    Picture beach = new Picture("C:\\Users\\Aeoni\\Desktop\\APCSA_Units_2022\\Choi_Daniel_apcsa-2022\\Unit 16\\src\\images\\beach.jpg");
    beach.explore();
    beach.grayscale();
    beach.explore();
  }
  
  public static void testFixUnderwater()
  {
    Picture water = new Picture("C:\\Users\\Aeoni\\Desktop\\APCSA_Units_2022\\Choi_Daniel_apcsa-2022\\Unit 16\\src\\images\\water.jpg");
    water.explore();
    water.fixUnderwater();
    water.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("C:\\Users\\Aeoni\\Desktop\\APCSA_Units_2022\\Choi_Daniel_apcsa-2022\\Unit 16\\src\\images\\caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
  {
    Picture beach = new Picture("C:\\Users\\Aeoni\\Desktop\\APCSA_Units_2022\\Choi_Daniel_apcsa-2022\\Unit 16\\src\\images\\beach.jpg");
    beach.explore();
    beach.mirrorVerticalRightToLeft();
    beach.explore();
  }
  
  public static void testMirrorHorizontal()
  {
    Picture motorcycle = new Picture("C:\\Users\\Aeoni\\Desktop\\APCSA_Units_2022\\Choi_Daniel_apcsa-2022\\Unit 16\\src\\images\\redMotorcycle.jpg");
    motorcycle.explore();
    motorcycle.mirrorHorizontal();
    motorcycle.explore();
  }
  
  public static void testMirrorHorizontalBotToTop()
  {
    Picture motorcycle = new Picture("C:\\Users\\Aeoni\\Desktop\\APCSA_Units_2022\\Choi_Daniel_apcsa-2022\\Unit 16\\src\\images\\redMotorcycle.jpg");
    motorcycle.explore();
    motorcycle.mirrorHorizontalBotToTop();
    motorcycle.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("C:\\Users\\Aeoni\\Desktop\\APCSA_Units_2022\\Choi_Daniel_apcsa-2022\\Unit 16\\src\\images\\temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testMirrorArms()
  {
    Picture arms = new Picture("C:\\Users\\Aeoni\\Desktop\\APCSA_Units_2022\\Choi_Daniel_apcsa-2022\\Unit 16\\src\\images\\snowman.jpg");
    arms.explore();
    arms.mirrorArms();
    arms.explore();
  }
  
  public static void testMirrorGull()
  {
    Picture gull = new Picture("C:\\Users\\Aeoni\\Desktop\\APCSA_Units_2022\\Choi_Daniel_apcsa-2022\\Unit 16\\src\\images\\seagull.jpg");
    gull.explore();
    gull.mirrorGull();
    gull.explore();
  }

  public static void testMirrorDiagonal()
  {
    Picture diagonal = new Picture("C:\\Users\\Aeoni\\Desktop\\APCSA_Units_2022\\Choi_Daniel_apcsa-2022\\Unit 16\\src\\images\\beach.jpg");
    diagonal.explore();
    diagonal.mirrorDiagonal();
    diagonal.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("C:\\Users\\Aeoni\\Desktop\\APCSA_Units_2022\\Choi_Daniel_apcsa-2022\\Unit 16\\src\\images\\640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("C:\\Users\\Aeoni\\Desktop\\APCSA_Units_2022\\Choi_Daniel_apcsa-2022\\Unit 16\\src\\images\\swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testSteganography()
  {
    Picture apple = new Picture("C:\\Users\\Aeoni\\OneDrive\\Desktop\\Choi_Daniel_apcsa-2022\\Picturelab Extension - Steganography\\src\\images\\apple_icon.jpg");
    Picture beach = new Picture("C:\\Users\\Aeoni\\OneDrive\\Desktop\\Choi_Daniel_apcsa-2022\\Picturelab Extension - Steganography\\src\\images\\beach.jpg");
    Picture msg = new Picture("C:\\Users\\Aeoni\\OneDrive\\Desktop\\Choi_Daniel_apcsa-2022\\Picturelab Extension - Steganography\\src\\images\\msg.jpg");
    /**/
    beach.encode(apple);
    beach.explore();
    beach.decode().explore();
    /*
    beach.encode(msg);
    beach.explore();
    beach.decode().explore();
    */
  }
  
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorVerticalRightToLeft();
    //testMirrorHorizontal();
    //testMirrorHorizontalBotToTop();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
	  testSteganography();
  }
}