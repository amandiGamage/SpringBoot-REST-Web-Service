/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wearit.dao.custom;

import com.ijse.wearit.dao.SuperDAO;
import com.ijse.wearit.model.Item;
import com.ijse.wearit.model.ItemDetails;
import com.ijse.wearit.model.Sizes;
import java.util.List;


public interface ItemDetailsDAO extends SuperDAO<ItemDetails>{
    public List<ItemDetails> searchByItemID(Item item);
    public ItemDetails getItemDetailsBySizeAndItem(Sizes sizeByName, Item item)throws Exception;
}
