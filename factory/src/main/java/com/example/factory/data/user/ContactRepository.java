package com.example.factory.data.user;

import com.example.factory.data.BaseDbRepository;
import com.example.factory.modle.db.User;
import com.example.factory.modle.db.User_Table;
import com.example.factory.persistence.Account;
import com.raizlabs.android.dbflow.sql.language.SQLite;

import java.util.List;

import hjh.factory.data.DataSource;

/**
 * @author 91319
 * @Title: ContactRepository
 * @ProjectName cocaChat
 * @Description: TODO 联系人仓库
 * @date 2019/1/29
 */
public class ContactRepository extends BaseDbRepository<User> implements ContactDataSource {
    @Override
    public void load(DataSource.SucceedCallback<List<User>> callback) {
        super.load(callback);

        // 加载本地数据库数据
        SQLite.select()
                .from(User.class)
                .where(User_Table.isFollow.eq(true))
                .and(User_Table.id.notEq(Account.getUserId()))
                .orderBy(User_Table.name, true)
                .limit(100)
                .async()
                .queryListResultCallback(this)
                .execute();
    }

    @Override
    protected boolean isRequired(User user) {
        return user.isFollow() && !user.getId().equals(Account.getUserId());
    }
}
