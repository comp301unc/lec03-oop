package com.comp301.lec03;

public class Container<T> {
  private T contents;

  public Container(T item) {
    contents = item;
  }

  public T getContents() {
    return contents;
  }

  public void setContents(T item) {
    contents = item;
  }
}
