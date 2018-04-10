package org.apache.zookeeper;

import org.apache.zookeeper.WatchedEvent;

/**
 * @auther: zhongweiwu
 * @Description:
 * @Date: 2018/4/10
 */
public interface Watcher {
    void process(WatchedEvent event);
}
