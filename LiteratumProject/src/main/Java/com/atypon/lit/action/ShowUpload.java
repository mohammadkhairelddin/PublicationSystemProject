package com.atypon.lit.action;

import com.atypon.lit.utility.FrontCommand;

import javax.servlet.ServletException;
import java.io.IOException;

public class ShowUpload extends FrontCommand {
    @Override
    public void process() throws ServletException, IOException {
        forward("/JSP/fileUpload.jsp");
    }
}
