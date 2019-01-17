package com.baizhi.zbw.DAO;

import com.baizhi.zbw.entity.Album;
import com.baizhi.zbw.entity.Chapter;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CDDAO {
    //查所有
    List<Album> selectAllDao();
    //单独查
    Album selectByAlbum(String id);
    //添加专辑
    void addAlbum(Album album);
    //添加音频
    void addChapter(@Param("chapter")Chapter chapter,@Param("albumId")String albumId);
}
