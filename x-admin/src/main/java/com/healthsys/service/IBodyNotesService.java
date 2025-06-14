package com.healthsys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.healthsys.entity.BodyNotes;

import java.util.List;


public interface IBodyNotesService extends IService<BodyNotes> {


    boolean insert(BodyNotes bodyNotes);

    List<BodyNotes> getBodyNotes(Integer id);


    void delete(Integer id);

    BodyNotes getUserBodyById(Integer  notesid);

    void updateUserBody(BodyNotes bodyNotes);

    void deleteUserBodyById(Integer id);
}
