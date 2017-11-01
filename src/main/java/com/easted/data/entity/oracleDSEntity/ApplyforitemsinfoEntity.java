package com.easted.data.entity.oracleDSEntity;

import javax.persistence.*;

/**
 * Created by admin on 2017/10/10.
 */
@Entity
@Table(name = "APPLYFORITEMSINFO", schema = "DGHY", catalog = "")
public class ApplyforitemsinfoEntity {

    @Id
    private String id;
    private String apppiecename;
    private String beizhu;
    private Long danweilianxidh;
    private Long dianziyouxiang;
    private String formid;
    private Long infoflowid;
    private String itemcode;
    private Long lxrsfzjhm;
    private Long lxrsj;
    private String lxrxm;
    private Long lxrzjlx;
    private String lianxidizhi;
    private Long lianxidianhua;
    private String lianxiren;
    private String loginname;
    private String sblsh;
    private Long sqrlx;
    private String sqrmc;
    private String sqrzjhm;
    private Long sqrzjlx;
    private Long serailno;
    private String shenfenzhenghao;
    private String shenpishixiangnr;
    private String shenqingren;
    private String shenqingshixiangnr;
    private String shixiangmingcheng;
    private Long srid;
    private String tongyishehuixydm;
    private Long ucid;
    private String xiangmubianhao;
    private Long xukeneirong;
    private String inserttime;
    private String message;
    private String state;
    private String status;
    private String type;

    @Basic
    @Column(name = "APPPIECENAME")
    public String getApppiecename() {
        return apppiecename;
    }

    public void setApppiecename(String apppiecename) {
        this.apppiecename = apppiecename;
    }

    @Basic
    @Column(name = "BEIZHU")
    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu;
    }

    @Basic
    @Column(name = "DANWEILIANXIDH")
    public Long getDanweilianxidh() {
        return danweilianxidh;
    }

    public void setDanweilianxidh(Long danweilianxidh) {
        this.danweilianxidh = danweilianxidh;
    }

    @Basic
    @Column(name = "DIANZIYOUXIANG")
    public Long getDianziyouxiang() {
        return dianziyouxiang;
    }

    public void setDianziyouxiang(Long dianziyouxiang) {
        this.dianziyouxiang = dianziyouxiang;
    }

    @Basic
    @Column(name = "FORMID")
    public String getFormid() {
        return formid;
    }

    public void setFormid(String formid) {
        this.formid = formid;
    }

    @Basic
    @Column(name = "INFOFLOWID")
    public Long getInfoflowid() {
        return infoflowid;
    }

    public void setInfoflowid(Long infoflowid) {
        this.infoflowid = infoflowid;
    }

    @Basic
    @Column(name = "ITEMCODE")
    public String getItemcode() {
        return itemcode;
    }

    public void setItemcode(String itemcode) {
        this.itemcode = itemcode;
    }

    @Basic
    @Column(name = "LXRSFZJHM")
    public Long getLxrsfzjhm() {
        return lxrsfzjhm;
    }

    public void setLxrsfzjhm(Long lxrsfzjhm) {
        this.lxrsfzjhm = lxrsfzjhm;
    }

    @Basic
    @Column(name = "LXRSJ")
    public Long getLxrsj() {
        return lxrsj;
    }

    public void setLxrsj(Long lxrsj) {
        this.lxrsj = lxrsj;
    }

    @Basic
    @Column(name = "LXRXM")
    public String getLxrxm() {
        return lxrxm;
    }

    public void setLxrxm(String lxrxm) {
        this.lxrxm = lxrxm;
    }

    @Basic
    @Column(name = "LXRZJLX")
    public Long getLxrzjlx() {
        return lxrzjlx;
    }

    public void setLxrzjlx(Long lxrzjlx) {
        this.lxrzjlx = lxrzjlx;
    }

    @Basic
    @Column(name = "LIANXIDIZHI")
    public String getLianxidizhi() {
        return lianxidizhi;
    }

    public void setLianxidizhi(String lianxidizhi) {
        this.lianxidizhi = lianxidizhi;
    }

    @Basic
    @Column(name = "LIANXIDIANHUA")
    public Long getLianxidianhua() {
        return lianxidianhua;
    }

    public void setLianxidianhua(Long lianxidianhua) {
        this.lianxidianhua = lianxidianhua;
    }

    @Basic
    @Column(name = "LIANXIREN")
    public String getLianxiren() {
        return lianxiren;
    }

    public void setLianxiren(String lianxiren) {
        this.lianxiren = lianxiren;
    }

    @Basic
    @Column(name = "LOGINNAME")
    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    @Basic
    @Column(name = "SBLSH")
    public String getSblsh() {
        return sblsh;
    }

    public void setSblsh(String sblsh) {
        this.sblsh = sblsh;
    }

    @Basic
    @Column(name = "SQRLX")
    public Long getSqrlx() {
        return sqrlx;
    }

    public void setSqrlx(Long sqrlx) {
        this.sqrlx = sqrlx;
    }

    @Basic
    @Column(name = "SQRMC")
    public String getSqrmc() {
        return sqrmc;
    }

    public void setSqrmc(String sqrmc) {
        this.sqrmc = sqrmc;
    }

    @Basic
    @Column(name = "SQRZJHM")
    public String getSqrzjhm() {
        return sqrzjhm;
    }

    public void setSqrzjhm(String sqrzjhm) {
        this.sqrzjhm = sqrzjhm;
    }

    @Basic
    @Column(name = "SQRZJLX")
    public Long getSqrzjlx() {
        return sqrzjlx;
    }

    public void setSqrzjlx(Long sqrzjlx) {
        this.sqrzjlx = sqrzjlx;
    }

    @Basic
    @Column(name = "SERAILNO")
    public Long getSerailno() {
        return serailno;
    }

    public void setSerailno(Long serailno) {
        this.serailno = serailno;
    }

    @Basic
    @Column(name = "SHENFENZHENGHAO")
    public String getShenfenzhenghao() {
        return shenfenzhenghao;
    }

    public void setShenfenzhenghao(String shenfenzhenghao) {
        this.shenfenzhenghao = shenfenzhenghao;
    }

    @Basic
    @Column(name = "SHENPISHIXIANGNR")
    public String getShenpishixiangnr() {
        return shenpishixiangnr;
    }

    public void setShenpishixiangnr(String shenpishixiangnr) {
        this.shenpishixiangnr = shenpishixiangnr;
    }

    @Basic
    @Column(name = "SHENQINGREN")
    public String getShenqingren() {
        return shenqingren;
    }

    public void setShenqingren(String shenqingren) {
        this.shenqingren = shenqingren;
    }

    @Basic
    @Column(name = "SHENQINGSHIXIANGNR")
    public String getShenqingshixiangnr() {
        return shenqingshixiangnr;
    }

    public void setShenqingshixiangnr(String shenqingshixiangnr) {
        this.shenqingshixiangnr = shenqingshixiangnr;
    }

    @Basic
    @Column(name = "SHIXIANGMINGCHENG")
    public String getShixiangmingcheng() {
        return shixiangmingcheng;
    }

    public void setShixiangmingcheng(String shixiangmingcheng) {
        this.shixiangmingcheng = shixiangmingcheng;
    }

    @Basic
    @Column(name = "SRID")
    public Long getSrid() {
        return srid;
    }

    public void setSrid(Long srid) {
        this.srid = srid;
    }

    @Basic
    @Column(name = "TONGYISHEHUIXYDM")
    public String getTongyishehuixydm() {
        return tongyishehuixydm;
    }

    public void setTongyishehuixydm(String tongyishehuixydm) {
        this.tongyishehuixydm = tongyishehuixydm;
    }

    @Basic
    @Column(name = "UCID")
    public Long getUcid() {
        return ucid;
    }

    public void setUcid(Long ucid) {
        this.ucid = ucid;
    }

    @Basic
    @Column(name = "XIANGMUBIANHAO")
    public String getXiangmubianhao() {
        return xiangmubianhao;
    }

    public void setXiangmubianhao(String xiangmubianhao) {
        this.xiangmubianhao = xiangmubianhao;
    }

    @Basic
    @Column(name = "XUKENEIRONG")
    public Long getXukeneirong() {
        return xukeneirong;
    }

    public void setXukeneirong(Long xukeneirong) {
        this.xukeneirong = xukeneirong;
    }

    @Basic
    @Column(name = "ID_")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "INSERTTIME")
    public String getInserttime() {
        return inserttime;
    }

    public void setInserttime(String inserttime) {
        this.inserttime = inserttime;
    }

    @Basic
    @Column(name = "MESSAGE")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Basic
    @Column(name = "STATE")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Basic
    @Column(name = "STATUS")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "TYPE")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApplyforitemsinfoEntity that = (ApplyforitemsinfoEntity) o;

        if (apppiecename != null ? !apppiecename.equals(that.apppiecename) : that.apppiecename != null) return false;
        if (beizhu != null ? !beizhu.equals(that.beizhu) : that.beizhu != null) return false;
        if (danweilianxidh != null ? !danweilianxidh.equals(that.danweilianxidh) : that.danweilianxidh != null)
            return false;
        if (dianziyouxiang != null ? !dianziyouxiang.equals(that.dianziyouxiang) : that.dianziyouxiang != null)
            return false;
        if (formid != null ? !formid.equals(that.formid) : that.formid != null) return false;
        if (infoflowid != null ? !infoflowid.equals(that.infoflowid) : that.infoflowid != null) return false;
        if (itemcode != null ? !itemcode.equals(that.itemcode) : that.itemcode != null) return false;
        if (lxrsfzjhm != null ? !lxrsfzjhm.equals(that.lxrsfzjhm) : that.lxrsfzjhm != null) return false;
        if (lxrsj != null ? !lxrsj.equals(that.lxrsj) : that.lxrsj != null) return false;
        if (lxrxm != null ? !lxrxm.equals(that.lxrxm) : that.lxrxm != null) return false;
        if (lxrzjlx != null ? !lxrzjlx.equals(that.lxrzjlx) : that.lxrzjlx != null) return false;
        if (lianxidizhi != null ? !lianxidizhi.equals(that.lianxidizhi) : that.lianxidizhi != null) return false;
        if (lianxidianhua != null ? !lianxidianhua.equals(that.lianxidianhua) : that.lianxidianhua != null)
            return false;
        if (lianxiren != null ? !lianxiren.equals(that.lianxiren) : that.lianxiren != null) return false;
        if (loginname != null ? !loginname.equals(that.loginname) : that.loginname != null) return false;
        if (sblsh != null ? !sblsh.equals(that.sblsh) : that.sblsh != null) return false;
        if (sqrlx != null ? !sqrlx.equals(that.sqrlx) : that.sqrlx != null) return false;
        if (sqrmc != null ? !sqrmc.equals(that.sqrmc) : that.sqrmc != null) return false;
        if (sqrzjhm != null ? !sqrzjhm.equals(that.sqrzjhm) : that.sqrzjhm != null) return false;
        if (sqrzjlx != null ? !sqrzjlx.equals(that.sqrzjlx) : that.sqrzjlx != null) return false;
        if (serailno != null ? !serailno.equals(that.serailno) : that.serailno != null) return false;
        if (shenfenzhenghao != null ? !shenfenzhenghao.equals(that.shenfenzhenghao) : that.shenfenzhenghao != null)
            return false;
        if (shenpishixiangnr != null ? !shenpishixiangnr.equals(that.shenpishixiangnr) : that.shenpishixiangnr != null)
            return false;
        if (shenqingren != null ? !shenqingren.equals(that.shenqingren) : that.shenqingren != null) return false;
        if (shenqingshixiangnr != null ? !shenqingshixiangnr.equals(that.shenqingshixiangnr) : that.shenqingshixiangnr != null)
            return false;
        if (shixiangmingcheng != null ? !shixiangmingcheng.equals(that.shixiangmingcheng) : that.shixiangmingcheng != null)
            return false;
        if (srid != null ? !srid.equals(that.srid) : that.srid != null) return false;
        if (tongyishehuixydm != null ? !tongyishehuixydm.equals(that.tongyishehuixydm) : that.tongyishehuixydm != null)
            return false;
        if (ucid != null ? !ucid.equals(that.ucid) : that.ucid != null) return false;
        if (xiangmubianhao != null ? !xiangmubianhao.equals(that.xiangmubianhao) : that.xiangmubianhao != null)
            return false;
        if (xukeneirong != null ? !xukeneirong.equals(that.xukeneirong) : that.xukeneirong != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (inserttime != null ? !inserttime.equals(that.inserttime) : that.inserttime != null) return false;
        if (message != null ? !message.equals(that.message) : that.message != null) return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = apppiecename != null ? apppiecename.hashCode() : 0;
        result = 31 * result + (beizhu != null ? beizhu.hashCode() : 0);
        result = 31 * result + (danweilianxidh != null ? danweilianxidh.hashCode() : 0);
        result = 31 * result + (dianziyouxiang != null ? dianziyouxiang.hashCode() : 0);
        result = 31 * result + (formid != null ? formid.hashCode() : 0);
        result = 31 * result + (infoflowid != null ? infoflowid.hashCode() : 0);
        result = 31 * result + (itemcode != null ? itemcode.hashCode() : 0);
        result = 31 * result + (lxrsfzjhm != null ? lxrsfzjhm.hashCode() : 0);
        result = 31 * result + (lxrsj != null ? lxrsj.hashCode() : 0);
        result = 31 * result + (lxrxm != null ? lxrxm.hashCode() : 0);
        result = 31 * result + (lxrzjlx != null ? lxrzjlx.hashCode() : 0);
        result = 31 * result + (lianxidizhi != null ? lianxidizhi.hashCode() : 0);
        result = 31 * result + (lianxidianhua != null ? lianxidianhua.hashCode() : 0);
        result = 31 * result + (lianxiren != null ? lianxiren.hashCode() : 0);
        result = 31 * result + (loginname != null ? loginname.hashCode() : 0);
        result = 31 * result + (sblsh != null ? sblsh.hashCode() : 0);
        result = 31 * result + (sqrlx != null ? sqrlx.hashCode() : 0);
        result = 31 * result + (sqrmc != null ? sqrmc.hashCode() : 0);
        result = 31 * result + (sqrzjhm != null ? sqrzjhm.hashCode() : 0);
        result = 31 * result + (sqrzjlx != null ? sqrzjlx.hashCode() : 0);
        result = 31 * result + (serailno != null ? serailno.hashCode() : 0);
        result = 31 * result + (shenfenzhenghao != null ? shenfenzhenghao.hashCode() : 0);
        result = 31 * result + (shenpishixiangnr != null ? shenpishixiangnr.hashCode() : 0);
        result = 31 * result + (shenqingren != null ? shenqingren.hashCode() : 0);
        result = 31 * result + (shenqingshixiangnr != null ? shenqingshixiangnr.hashCode() : 0);
        result = 31 * result + (shixiangmingcheng != null ? shixiangmingcheng.hashCode() : 0);
        result = 31 * result + (srid != null ? srid.hashCode() : 0);
        result = 31 * result + (tongyishehuixydm != null ? tongyishehuixydm.hashCode() : 0);
        result = 31 * result + (ucid != null ? ucid.hashCode() : 0);
        result = 31 * result + (xiangmubianhao != null ? xiangmubianhao.hashCode() : 0);
        result = 31 * result + (xukeneirong != null ? xukeneirong.hashCode() : 0);
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (inserttime != null ? inserttime.hashCode() : 0);
        result = 31 * result + (message != null ? message.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}
