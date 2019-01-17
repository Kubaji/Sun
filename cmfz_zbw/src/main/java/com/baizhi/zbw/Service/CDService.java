package com.baizhi.zbw.Service;
import com.baizhi.zbw.entity.Album;
import com.baizhi.zbw.entity.Chapter;

import java.util.List;

public interface CDService {
    //查所有
    List<Album> queryAllService();
    //单独查
    Album queryByAlbum(String Id);
    //添加专辑
    void insertAlbum(Album album);
    //添加音频
    void insertChapter(Chapter chapter,String albumId);
}
