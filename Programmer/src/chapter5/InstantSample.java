package chapter5;

import java.time.Duration;
import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantSample {

	public static void main(String[] args) {

		Instant now = Instant.now();
		Instant nowPlus10 = now.plusSeconds(10);
		
		System.out.println( Duration.between(now, nowPlus10).toMillis() );

		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println( zdt );
		System.out.println( zdt.toInstant() );
		long epochTime = zdt.toEpochSecond();		
		System.out.println( Instant.ofEpochSecond(epochTime) );
		System.out.println( now.toEpochMilli() );

	}

}
