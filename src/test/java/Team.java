import java.io.File;
import java.io.IOException;
import com.Pojo.Player;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Pojo.TeamDetails;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Team {
	@Test
	public void playerverification() throws StreamReadException, DatabindException, IOException {
		File file = new File("C:\\Users\\ELCOT\\eclipse-workspace\\RcbPlayers\\src\\test\\resources\\rcb.json");
		ObjectMapper map = new ObjectMapper();
		TeamDetails team = map.readValue(file, TeamDetails.class);
		int foreignPlayer = 0;
		int keepercount = 0;
		for (int i = 0; i < team.getPlayer().size(); i++) {

			if (!(boolean) team.getPlayer().get(i).getCountry().equals("India")) {
				foreignPlayer++;
			}
			if ((boolean) team.getPlayer().get(i).getRole().equals("Wicket-keeper")) {
				keepercount++;
			}

		}
		if (foreignPlayer == 4) {
			System.out.println("Team contains only " + foreignPlayer + " foreign player");

		} else {
			System.out.println("Teams must contains 4 foreign players");
		}
		if (keepercount >= 1) {
			System.out.println("team contains atleast wicket keeper");
		} else {
			System.out.println("team requires atleast one wicket keeper");
		}
		Assert.assertEquals(foreignPlayer, 4);
		Assert.assertEquals(keepercount, 1);
	}

}
