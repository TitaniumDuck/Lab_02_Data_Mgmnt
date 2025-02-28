// Rule 02 - Expressions (EXPs)
// Part EXP00-J - Do Not Ignore Values Retuned by Methods

public void deleteFile() {

  File someFile = new File(" someFileName.txt ");
  // Do something with someFile
  if(!someFile.delete()) {
    // Handle failure to delete the file
  }

}
