package com.baizhi.zbw.Service.Impl;

import com.baizhi.zbw.DAO.CDDAO;
import com.baizhi.zbw.Service.CDService;
import com.baizhi.zbw.entity.Album;
import com.baizhi.zbw.entity.Chapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("cdService")
public class CDServiceImpl implements CDService {
    @Autowired
    private CDDAO cddao;

    @Override
    public List<Album> queryAllService() {
        return cddao.selectAllDao();
    }

    @Override
    public Album queryByAlbum(String Id) {
        return cddao.selectByAlbum(Id);
    }

    @Override
    public void insertAlbum(Album album) {
        cddao.addAlbum(album);
    }

    @Override
    public void insertChapter(Chapter chapter,String albumId) {
        cddao.addChapter(chapter,albumId);
    }

}
