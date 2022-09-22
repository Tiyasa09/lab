package lab;

public class Movie {
 private String movieName;
 private float movieStartTime;
 private float movieEndTime;
 private int movieTicketPrice;
 public String getMovie() {
	 return movieName+" "+movieStartTime+" "+movieEndTime+" "+movieTicketPrice;
 }
 public void setMovie(String movieName,float movieStartTime,float movieEndTime,int movieTicketPrice) {
	 this.movieName=movieName;
	 this.movieStartTime=movieStartTime;
	 this.movieEndTime=movieEndTime;
	 this.movieTicketPrice=movieTicketPrice;
	 System.out.println("Movie details:");
 }
	 
 }


