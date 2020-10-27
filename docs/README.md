# E-Commerce System
Store Module  กลุ่ม หลอดไฟ

**รายชื่อสมาชิก**
1. 
2. 
3. 
4. 
5. 
6.


## User Interface

**หมายเหตุ:** 1. เนื่องจากยังไม่ได้ลงรายละเอียดในส่วนของการทำงาน จึงไม่สามารถทำงานอื่นได้ (Search, Create, Update, Delete) นอกจากการแสดงรายละเอียด (Read)

## Store Services
* การสร้างรายการสินค้าใหม่ (Create)
* การดูรายละเอียดของรายการสินค้า (Read)
* การแก้ไขข้อมูลรายละเอียดของรายการสินค้า (Update)
* การลบรายการสินค้า (Delete)
* การค้นหารายการสินค้า (Search)

## Product Database (Logical Design)
![Product Database (Logical Design)](https://github.com/tanknk/E-CommerceSystem/blob/Product/assets/images/Product_db.png)
**รายละเอียด**
1. สินค้า (Product) มีการเก็บข้อมูลดังนี้
    * รหัสของสินค้า (id)
    * ชื่อของสินค้า (name)
    * ราคาของสินค้า (price)
    * รายละเอียดของรสินค้า (description)
    * ยอดคงคลังของสินค้า (amount)
    * รูปภาพของสินค้า (picture)
    * น้ำหนักของสินค้า (weight)
    * รหัสของร้านค้าที่เป็นผู้ขายสินค้านั้น ๆ (shop_id)
    * รหัสของยี่ห้อของสินค้า (brand_id)
    * รหัสของหมวดหมู่ของสินค้า (category_id)
    
2. ยี่ห้อ (Brand) มีการเก็บข้อมูลดังนี้
      * รหัสของยี่ห้อ (id)
      * ชื่อของยี่ห้อ (name)

3. หมวดหมู่ (Category) มีการเก็บข้อมูลดังนี้
      * รหัสของหมวดหมู่ (category)
      * ชื่อของหมวดหมู่ (name)
    
**หมายเหตุ:** 1. ตาราง SHOP และ ORDER รอรายละเอียดจากกลุ่มที่ทำ Module นั้น ๆ
