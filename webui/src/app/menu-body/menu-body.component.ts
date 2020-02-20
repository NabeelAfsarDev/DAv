import { Component, OnInit } from '@angular/core';
import { MenuServiceService } from '../services/menu-service.service';
import { MenuObject } from '../classes/menu-object';

@Component({
  selector: 'app-menu-body',
  templateUrl: './menu-body.component.html',
  styleUrls: ['./menu-body.component.css']
})
export class MenuBodyComponent implements OnInit {
  menuItems = new Array<MenuObject>();
  constructor(menuService:MenuServiceService) {
    menuService.getMenuItems().subscribe(
      response =>{
        this.menuItems = response.map( callBackItem =>{
          return new MenuObject(
            callBackItem.name,
            callBackItem.imageUrl,
            callBackItem.description
          );
        }

        );
      }
    );
   }

  ngOnInit(): void {
  }

}
