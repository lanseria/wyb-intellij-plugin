package cn.ivhik.wyb.intellij.plugin.remind;

import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.diagnostic.Logger;

/**
 * {@link RemindComponent} 实现类
 *
 * @author maomao
 * @version 1.0
 * @since 2019-04-03
 */
public class RemindComponentImpl implements RemindComponent {
    private static final Logger LOG = Logger.getInstance(RemindComponentImpl.class);

    public RemindComponentImpl() {
        ApplicationManager.getApplication().invokeLater(() -> {
            LOG.info("=== Programmer Motivator: YiBo Wang(王一博鼓励师) ===");

            RemindTask.init();
            LOG.info("start scheduled remind task");
        });
    }

}
