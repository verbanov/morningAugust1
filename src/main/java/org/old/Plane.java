package org.old;

public class Plane {
  //write your code below this line
  private String name;
  private String model;
  private int yearIssue;
  private int passengers;
  private String color;

  public Plane(PlaneBuilder planeBuilder) {
      this.name = planeBuilder.name;
      this.model = planeBuilder.model;
      this.yearIssue = planeBuilder.yearIssue;
      this.passengers = planeBuilder.passengers;
      this.color = planeBuilder.color;
  }

  public static class PlaneBuilder {
      private String name;
      private String model;
      private int yearIssue;
      private int passengers;
      private String color;

      public PlaneBuilder() {

      }

      public PlaneBuilder setName(String name) {
          this.name = name;
          return this;
      }

      public PlaneBuilder setModel(String model) {
          this.model = model;
          return this;
      }

      public PlaneBuilder setYearIssue(int yearIssue) {
          this.yearIssue = yearIssue;
          return this;
      }

      public PlaneBuilder setPassengers(int passengers) {
          this.passengers = passengers;
          return this;
      }

      public PlaneBuilder setColor(String color) {
          this.color = color;
          return this;
      }

      public Plane build() {
          return new Plane(this);
      }
  }
}
