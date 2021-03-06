package me.joshua.webx.springext.configurationpoints.echo;

import me.joshua.webx.springext.configurationpoints.echo.decorator.Decorator;

/**
 * @author <a href="mailto:daonan.zhan@gmail.com">Joshua Zhan</a> 2012-10-5
 */
public class EchoServiceImpl implements EchoService {

	private String title;
	private String preTitle;
	private String postTitle;
	private String separator;
	private Decorator decorator;

	@Override
	public String echo(String message) {
		StringBuilder sb = new StringBuilder();

		sb.append(preTitle).append(title).append(postTitle).append(separator)
				.append(' ');
		if (null != decorator) {
			sb.append(decorator.decorate(message));
		} else {
			sb.append(message);
		}

		return sb.toString();
	}

	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public void setPreTitle(String preTitle) {
		this.preTitle = preTitle;
	}

	@Override
	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}

	@Override
	public void setSeparator(String separator) {
		this.separator = separator;
	}

	@Override
	public void setDecorator(Decorator decorator) {
		this.decorator = decorator;
	}

}
