package org.example;

public class Client {
  public static void main(String[] args) {
    Node driveD = new Folder("D");

    Node doc = new Folder("docs");
    doc.add(new File("file1"));
    doc.add(new File("file2"));

    driveD.add(doc);

    Node picture = new Folder("pictures");

    picture.add(new File("file3"));
    picture.add(new File("file4"));

    driveD.add(picture);
  }
}
