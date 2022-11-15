package app.oly.stonebridge.data;



import app.oly.stonebridge.data.filter.Filter;
import app.oly.stonebridge.module.Entity;
import app.oly.stonebridge.module.meta.MetaEntity;

import java.util.Map;

public interface IPersistence {

    long create(Entity entity) throws DataException;

    void delete(MetaEntity meta , long id)throws DataException;

    void delete(Filter filter, Map<String,Object> params) throws DataException;

    void update(Filter filter, Map<String,Object> updateParams, Map<String,Object> params) throws DataException;

    Entity get(MetaEntity meta, long id) throws DataException;

    DataResult query(Filter filter)throws DataException;
 }

