package com.tiger.zmz.common.utils;

import com.jcraft.jsch.*;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author zhanghai2
 * @Description: sshUtil
 * @date 2019-7-13
 */
@Slf4j
public class SshUtil {

  public static String execCommandByJSch(Session session, String command, String resultEncoding) {
    ChannelExec channelExec = null;
    String result = StringUtils.EMPTY;
    try {
      channelExec = (ChannelExec) session.openChannel("exec");
      InputStream in = channelExec.getInputStream();
      channelExec.setCommand(command);
      channelExec.setErrStream(System.err);
      channelExec.connect();
      result = IOUtils.toString(in, resultEncoding);
    } catch (JSchException e) {
      log.error("*****execCommandByJSch JSchException, :{}*****", e);
    } catch (IOException e1) {
      log.error("*****execCommandByJSch IOException, :{}*****", e1);
    } finally {
      if (null != channelExec && channelExec.isConnected()) {
        channelExec.disconnect();
      }
    }

    return result;
  }

  public static Channel getSftpChannel(Session session) {
    Channel channel = null;
    try {
      channel = session.openChannel("sftp");
      channel.connect();
      log.info("*****get getSftpChannel success!*****");
    } catch (JSchException e) {
      log.info("*****get getSftpChannel fail!*****", e);
    }
    return channel;
  }

  public static Session getSession(String host, int port, String username, final String password) {
    Session session = null;
    try {
      JSch jsch = new JSch();
      session = jsch.getSession(username, host, port);
      session.setPassword(password);
      Properties sshConfig = new Properties();
      // 第一次访问服务器时不用输入yes
      sshConfig.put("StrictHostKeyChecking", "no");
      session.setConfig(sshConfig);
      session.connect();
      log.info("*****Session connected!*****");
    } catch (JSchException e) {
      log.error("*****get Session failed!*****", e);
    }
    return session;
  }

  public static void closeChannel(Channel channel) {
    if (null != channel && channel.isConnected()) {
      channel.disconnect();
    }
  }

  public static void closeSession(Session session) {
    if (null != session && session.isConnected()) {
      session.disconnect();
    }
  }
}
