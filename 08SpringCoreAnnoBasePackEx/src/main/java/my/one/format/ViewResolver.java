package my.one.format;

import org.springframework.beans.factory.annotation.Value;

public class ViewResolver {
	@Value("pages")
	private String prefix;
	
	@Value("jsp")
	private String suffix;

	@Override
	public String toString() {
		return "ViewResolver [prefix=" + prefix + ", suffix=" + suffix + "]";
	}
	
	

}
