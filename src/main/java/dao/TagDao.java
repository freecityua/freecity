package dao;

import java.util.concurrent.CopyOnWriteArraySet;

import dao.exceptions.DaoSystemException;
import entity.Tag;

public interface TagDao { 

	CopyOnWriteArraySet<Tag> selectAll() throws DaoSystemException;
}
