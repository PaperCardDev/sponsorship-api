package cn.paper_card.sponsorship.api;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.UUID;

@SuppressWarnings("unused")
public interface SponsorshipService {

    // 添加赞助记录，添加成功返回赞助ID（大于0）
    int add(@NotNull SponsorshipInfo info) throws Exception;

    // 根据ID进行查询
    @Nullable SponsorshipInfo queryById(int id) throws Exception;

    // 分页查询赞助记录
    @NotNull List<SponsorshipInfo> queryByPage(int limit, int offset) throws Exception;

    // 分页查询赞助记录，按时间降序排序
    @NotNull List<SponsorshipInfo> queryLatestByPage(int limit, int offset) throws Exception;

    // 查询特别赞助记录，按时间升序进行排序
    @NotNull List<SponsorshipInfo> querySpecialOrderByTimeWithPage(int limit, int offset) throws Exception;

    // 分页查询一个玩家的赞助记录
    @NotNull List<SponsorshipInfo> queryByPlayerWithPage(@NotNull UUID uuid, int limit, int offset) throws Exception;

    // 分页查询赞助排行榜
    @NotNull List<SponsorshipTopInfo> queryTopByPage(int limit, int offset) throws Exception;

    // 查询一个玩家最近的赞助时间和赞助总额
    @Nullable SponsorshipPlayerInfo queryPlayerInfo(@NotNull UUID uuid) throws Exception;

    // 一个玩家的赞助次数
    int queryCount(@NotNull UUID uuid) throws Exception;

    // 更新赞助者
    boolean updateUuidAndNameById(@NotNull UUID uuid, @NotNull String name, int id) throws Exception;

    // 更新所有信息
    boolean updateAllById(@NotNull SponsorshipInfo info) throws Exception;
}
