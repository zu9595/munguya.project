package com.mun9.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Control {
	public void execute(HttpServletRequest req, HttpServletResponse resp);
}
