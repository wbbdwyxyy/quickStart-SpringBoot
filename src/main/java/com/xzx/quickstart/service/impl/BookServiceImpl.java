package com.xzx.quickstart.service.impl;

import com.xzx.quickstart.pojo.Book;
import com.xzx.quickstart.mapper.BookMapper;
import com.xzx.quickstart.service.IBookService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 书籍 服务实现类
 * </p>
 *
 * @author xzx
 * @since 2023-04-21
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements IBookService {

}
